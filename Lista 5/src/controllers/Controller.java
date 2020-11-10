package controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import lista5.*;

public class Controller {
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
		// lista.printList();
		lista.printVendas();
        scan = new Scanner(System.in);
        execute = true;
        System.out.println("\nRegistro de animais");

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
                    //showList();
                } else if (list.equalsIgnoreCase("2")) {
                	//showCarsList();
                } else if (list.equalsIgnoreCase("3")) {
                    // voltar para o inicio do programa
                } else {
                    System.out.println("Favor digitar um número válido!!");
                }

            } else if (option.equalsIgnoreCase("3")) {
            	//addRev();
            } else if (option.equalsIgnoreCase("4")) {
            	//editRev();
            } else if (option.equalsIgnoreCase("5")) {
               // remove();
            } else if (option.equalsIgnoreCase("6")) {
                //relatorios();
            } else if (option.equalsIgnoreCase("7")) {
                execute = false;
            } else {
                System.out.println("Favor digitar um número válido!!");
            }
        }
    }

    public String mainMenu() {
        System.out.println("\nSelecione a opção: ");
        System.out.println("1 - Novo cadastro");
        System.out.println("2 - Controle de vacinas");
        System.out.println("3 - Relátorios");
        System.out.println("4 - Sair");
        return scan.nextLine();
       
    }

    public String listMenu() {
        System.out.println("\nSelecione a opção: ");
        System.out.println("1 - Todos os clientes cadastrados");
        System.out.println("2 - Carros cadastrados");
        System.out.println("3 - Voltar");
        return scan.nextLine();
    }
    
    public String listMenuCadastro() {
        System.out.println("\nSelecione a opção: ");
        System.out.println("1 - Suino");
        System.out.println("2 - Bovino");
        System.out.println("3 - Voltar");
        return scan.nextLine();
    }
    public String listRev() {
        System.out.println("\nSelecione a opção: ");
        System.out.println("1 - Troca de óleo");
        System.out.println("2 - Calibragem dos pneus");
        System.out.println("3 - Troca de Bateria");
        System.out.println("4 - Lavagem");
        System.out.println("5 - Check-in completo");
        System.out.println("6 - Outros");
        System.out.println("7 - Voltar");
        return scan.nextLine();
    }

    private void register(int tipo) {
        boolean registering = true;
        while (registering) {
            System.out.println("\nCadastro de Animal");
            if (tipo==1) {
            	Animal animal = new Suinos();
            } else if(tipo==2) {
            	Animal animal = new Bovinos();
            }
            
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
    private String textInput(String label) {
        System.out.println(label);
        return scan.nextLine();
    }

}