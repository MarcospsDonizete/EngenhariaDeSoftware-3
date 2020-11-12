package controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lista5.*;

public class Controller {
	RelatorioAnimais relatorios = new RelatorioAnimais();
    private Scanner scan;
    private boolean execute;

    public void start() throws IOException {
    	RelatorioAnimais lista = new RelatorioAnimais();
    	List<String> temp = new ArrayList<String>();
    	Files.lines(new File("BD.txt").toPath()).forEach(temp::add);
    	for(String s:temp) {
			String[] t=s.split(";");
			if (!t[0].equals("especie")) {
				if(t[10].equals("0")) {
					if(t[0].equals("bovino")) {
						lista.addAnimal(new Bovinos(t[1],t[2],t[3],t[4],t[5],t[6],t[7],t[8],t[9]));
					} else if(t[0].equals("suino")) {
						lista.addAnimal(new Suinos(t[1],t[2],t[3],t[4],t[5],t[6],t[7],t[8],t[9]));
					}
				} else {
					if(t[0].equals("bovino")) {
						lista.addVenda(new Vendas(new Bovinos(t[1],t[2],t[3],t[4],t[5],t[6],t[7],t[8],t[9]), Double.parseDouble(t[11])));
					} else if(t[0].equals("suino")) {
						lista.addVenda(new Vendas(new Suinos(t[1],t[2],t[3],t[4],t[5],t[6],t[7],t[8],t[9]), Double.parseDouble(t[11])));
					}
				}
			}
    	}
        scan = new Scanner(System.in);
        execute = true;
        System.out.println("\nBom Dia!!");

        while (execute) {
            String option = mainMenu();

            if (option.equalsIgnoreCase("1")) {
            	String list = listMenuCadastro();
            	if (list.equalsIgnoreCase("1")) {
            			register(1);
            		} else if (list.equalsIgnoreCase("2")) {
            			register(2);
            		} else if (list.equalsIgnoreCase("3")) {
            			// voltar para o inicio do programa
            		} else {
                         System.out.println("Favor digitar um número válido!!");
                    }
                
            } else if (option.equalsIgnoreCase("2")) {
                String list = listMenu();
                if (list.equalsIgnoreCase("1")) {
                	relatorios.printList();
                } else if (list.equalsIgnoreCase("2")) {
                	relatorios.populacao();
                } else if (list.equalsIgnoreCase("3")) {
                    relatorios.pesoRebanho();
                } else if (list.equalsIgnoreCase("4")) {
                    relatorios.vacinacao();
                } else if (list.equalsIgnoreCase("5")) {
                    relatorios.printVendas();
                } else if (list.equalsIgnoreCase("6")) {
                    precoPeso();
                } else if (list.equalsIgnoreCase("7")) {
                    // voltar para o inicio do programa
                } else {
                    System.out.println("Favor digitar um número válido!!");
                }

            } else if (option.equalsIgnoreCase("3")) {
                Venda();                
            } else if (option.equalsIgnoreCase("4")) {
            	controleVacinas();
            } else if (option.equalsIgnoreCase("5")) {
            	execute = false;
            } else {
                System.out.println("Favor digitar um número válido!!");
            }
        }
    }

	public String mainMenu() {
        System.out.println("\nSelecione a opção: ");
        System.out.println("1 - Novo cadastro");
        System.out.println("2 - Relátorios");
        System.out.println("3 - Venda de animal");
        System.out.println("4 - Controle de vacinas");
        System.out.println("5 - Sair");
        return scan.nextLine();
       
    }

    public String listMenu() {
    	System.out.println("\nSelecione a opção: ");
        System.out.println("1 - Todos animais");
        System.out.println("2 - Porcentagem de Gênero");
        System.out.println("3 - Peso do Rebanho");
        System.out.println("4 - Relatório de Vacinas do Rebanho");
        System.out.println("5 - Relatório de vendas");
        System.out.println("6 - Preço por peso");
        System.out.println("7 - Voltar");
        return scan.nextLine();
    }
    
    public String listMenuCadastro() {
        System.out.println("\nSelecione a opção: ");
        System.out.println("1 - Suino");
        System.out.println("2 - Bovino");
        System.out.println("3 - Voltar");
        return scan.nextLine();
    }    

    private void register(int tipo) {
        boolean registering = true;
        while (registering) {
            System.out.println("\nCadastro de Animal");
            Animal animal = null;
            
            if(tipo == 1) {
            	animal = new Suinos();
            
            } else if(tipo == 2) {
            
            	animal = new Bovinos();
            }
            
			animal.setNome(textInput("\n Nome:"));
            animal.setGenero(textInput("\n Genero (Macho/Fêmea):"));
            animal.setId(textInput("\n Id: "));
            animal.setRaca(textInput("\n Raça: "));
            animal.setDataDeNascimento(textInput("\n Data De Nascimento: "));
            System.out.println("Peso: ");
        	String peso = scan.nextLine();
        	
        	double dPeso = Double.parseDouble(peso);
        	
        	System.out.println("1 para KG  ||  2 para Arroba");
        	String pesoTipo = scan.nextLine();
        	
        	if(pesoTipo.equals("1")) {
        		Peso pesoanimal = new Peso(dPeso,1);
            	animal.setPeso(pesoanimal);
            } else if(pesoTipo.equals("2")) {
            	Peso pesoanimal = new Peso(dPeso,2);
            	animal.setPeso(pesoanimal);
            }
        	RelatorioAnimais.getLista().add(animal);
            
            String register = textInput("\nAdicionar cadastro (S/N) ?");
            if (register.equalsIgnoreCase("s")) {
                System.out.println("Cadastro adicionado!!");
               
            } else if (register.equalsIgnoreCase("n")) {
                System.out.println("Cadastro ignorado !!!");
            } else {
                System.out.println("\nOpção inválida, favor digitar denovo!! \n");
            }
            String newRegister = textInput("\nContinuar cadastrando (S/N) ?");
            if (newRegister.equalsIgnoreCase("N")) {
                registering = false;
            } else if (newRegister.equalsIgnoreCase("s")) {
                // se for s sai do if e volta para o inicio do while
            } else {
                System.out.println("\nOpção inválida, parando o cadastro!! \n");
                registering = false;
            }
        }
    }
    
    private void Venda() {
    	List<String> IDanimais = new ArrayList<String>();
    	List<Animal> animais = new ArrayList<Animal>();
    	
    	System.out.println("\n Venda de animais");
    	System.out.println("\n Digite o ID do animal vendido ou exit para sair");
    	String Id = "";
    	while(true) {
    		System.out.println("\n Digite o id");
    		Id = scan.nextLine();
    		if(Id.equals("exit"))
    			break;
    		else 
    			IDanimais.add(Id);
    	}
    	System.out.println("\n Valor da venda: ");
		double valor = Double.valueOf(scan.nextLine());
		for (String Idanimal:IDanimais) {
			animais.add(pesquisar(Idanimal));
		}
		Vendas venda = new Vendas(animais,valor);
		RelatorioAnimais.getListaVendas().add(venda);
		RelatorioAnimais.getLista().removeAll(animais);
	}
    

	private void precoPeso() {
		System.out.println("\n Usar valor padrão(digite 1) ou Custom (digite 2)? \n");
		String precoTipo = scan.nextLine();
		double valorbovino=0;
		double valorsuino=0;
		double total=0;
		
		if(precoTipo.equals("1")) {
			valorbovino=280.50;
			valorsuino=179.00 ;
        } else if(precoTipo.equals("2") ) {
        	System.out.println("\n Valor bovino \n");
        	valorbovino = Double.parseDouble(scan.nextLine());
        	System.out.println("\n Valor suino \n");
        	valorsuino = Double.parseDouble(scan.nextLine());
        }
		
		for(Animal animal:RelatorioAnimais.getLista()) {
			if(animal instanceof Bovinos) {
				total+=(animal.peso.arroba()*valorbovino);
			}
			else if(animal instanceof Suinos) {
				total+=(animal.peso.arroba()*valorsuino);
			}
		}
		System.out.println("Valor do Rebanho: R$"+total);
	}


	private void controleVacinas() {
		// TODO Auto-generated method stub
	}
    
    private String textInput(String label) {
        System.out.println(label);
        return scan.nextLine();
    }
    
    public Animal pesquisar(String id) {
        for (int i = 0; i <= RelatorioAnimais.getLista().size(); i++) {
            if (id.equals( RelatorioAnimais.getLista().get(i).id)) return RelatorioAnimais.getLista().get(i);
        }
        return null;
    }
}