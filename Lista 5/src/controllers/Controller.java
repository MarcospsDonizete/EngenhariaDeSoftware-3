package controllers;

import java.util.Collections;
import java.util.Scanner;
import lista5.*;

public class Controller {
    private Scanner scan;
    private boolean execute;

    public void start() {
        scan = new Scanner(System.in);
        execute = true;
        System.out.println("\nRegistro de animais");

        while (execute) {
            String option = mainMenu();

            if (option.equalsIgnoreCase("1")) {
            	String list = listMenuCadastro();
                     if (list.equalsIgnoreCase("1")) {
                    	 register();
                     } else if (list.equalsIgnoreCase("2")) {
                    	 System.out.println("oi leticia né?");
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
            	Animal animal = new Suino();
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