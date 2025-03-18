import java.util.Scanner;

public class Main{

    
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){

        int to_do = 0;

        int howManyObjects = 0;
        // Max is 10 objects

        Produto[] objects = new Produto[10];
                        
        float price = 0;
        float weight = 0;
        String name = "";
        int ID = 0;
        

        int whatAmIPointingAt = 0;

        do {
            
            System.out.println(
                "1 - Criar um produto \n" +
                "2 - Editar um produto \n" +
                "3 - Excluir um produto \n" +
                "4 - Listar os produtos \n" +
                "0 - Sair \n"
            );

            to_do = cin.nextInt();

            switch(to_do){

                case 0:
                    break;
                
                case 1:
                
                System.out.println(
                    "1 - Inicializar nome, preço e ID \n" +
                    "2 - Inicializar apenas nome \n" +
                    "3 - Inicializar nome e ID \n" +
                    "4 - Inicializar nome e peso \n"
                    );
                    
                    to_do = cin.nextInt();
                    switch (to_do) {
                        case 1:
                            
                            System.out.println("Insira o preço: ");
                            price = cin.nextFloat();
                            cin.nextLine();

                            System.out.println("Insira o nome: ");
                            name = cin.nextLine();
                            
                            
                            System.out.println("Insira o ID");
                            ID = cin.nextInt();

                            objects[howManyObjects] = new Produto(price, name, ID);
                            objects[howManyObjects].setID(ID);
                            howManyObjects++;

                            break;
                        case 2:

                            cin.nextLine(); 
                            System.out.println("Insira o nome");
                            name = cin.nextLine();

                            objects[howManyObjects] = new Produto(name);
                            howManyObjects++;

                            break;

                        case 3:

                            cin.nextLine();
                            System.out.println("Insira o nome");
                            name = cin.nextLine();

                            System.out.println("Insira o ID");
                            ID = cin.nextInt();

                            objects[howManyObjects] = new Produto(name, ID);
                            objects[howManyObjects].setID(ID);
                            howManyObjects++;
                        
                            break;
                        case 4:

                            cin.nextLine();
                            System.out.println("Insira o nome");
                            name = cin.nextLine();

                            System.out.println("Insira o peso");
                            weight = cin.nextFloat();

                            objects[howManyObjects] = new Produto(name, weight);
                            howManyObjects++;

                            break;

                        default:
                            break;
                    }
                
                break;    
                case 2:
                    
                    System.out.println("Escolha qual objeto na lista você quer editar? \n");
                    
                    for(int i = 0; i < 10; i++){

                        if(objects[i] != null){
                            System.out.println(i + " - Nome: " + objects[i].getName() + "\n");
                        }

                    }
                    whatAmIPointingAt = cin.nextInt();


                    System.out.println(
                        "1 - Editar nome\n" +
                        "2 - Editar preço\n" +
                        "3 - Editar descrição\n" +
                        "4 - Editar peso\n"
                    );
                    
                    to_do = cin.nextInt();
                    cin.nextLine();

                    switch (to_do) {
                        case 1:

                            System.out.println("Editando nome do objeto " + objects[whatAmIPointingAt].getName() + "\n");
                            objects[whatAmIPointingAt].setName(cin.nextLine());

                            break;
                        case 2:

                            System.out.println("Editando preço do objeto " + objects[whatAmIPointingAt].getName() + "\n");
                            objects[whatAmIPointingAt].setPrice(cin.nextFloat());

                            break;

                        case 3:
                            
                            System.out.println("Editando descrição do objeto " + objects[whatAmIPointingAt].getName() + "\n");
                            objects[whatAmIPointingAt].setDescription(cin.nextLine());                                        
                            
                            break;

                        case 4:

                            System.out.println("Editando peso do objeto " + objects[whatAmIPointingAt].getName() + "\n");
                            objects[whatAmIPointingAt].setWeight(cin.nextFloat());
                            break;

                        } // Editing an object
                    break;
                case 3:
                    
                    System.out.println("Escolha qual objeto na lista você quer excluir? \n");
                    for(int i = 0; i < 10; i++){

                        if(objects[i] != null){
                            System.out.println(i + " - Nome: " + objects[i].getName() + "\n");
                        }

                    }
                    whatAmIPointingAt = cin.nextInt();
                    objects[whatAmIPointingAt] = null;
                    howManyObjects--;
                    
                    for(int i = 1; i < 10; i++){

                        if((objects[i - 1] == null) && (i >= 1)){
                            objects[i - 1] = objects[i];
                            objects[i] = null;
                        }
                        

                    }

                    break;
                    
                case 4:
                    
                    for(int i = 0; i < 10; i++){

                        if(objects[i] != null){
                            System.out.println(i + " - Nome: " + objects[i].getName() + "\nPreço: "  + "R$" + objects[i].getPrice() + "\nPeso: " + objects[i].getWeight() + "Kg" + "\nID code: " + objects[i].getID() + "\n"
                                + "Descrição: " + objects[i].getDescription() + "\n\n\n\n"
                            );
                        }

                    }
                    break;
                    
                default:
                    System.out.println("Opção inválida\n\n\n\n\n");
                    break;
            }
            
    } while (to_do != 0);
    }

}