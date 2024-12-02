import java.util.ArrayList;  
import java.util.Scanner;    

public class Main {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        
        AnimalService animalService = new AnimalService();
        AdotanteService adotanteService = new AdotanteService();
        ArrayList<Adotante> adotantes = new ArrayList<>();
        ArrayList<Voluntario> voluntarios = new ArrayList<>();
        ArrayList<Adocao> adocoes = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();


        while(true){
            System.out.println("Menu:");
            System.out.println("1) Cliente");
            System.out.println("2) Gerente");
            System.out.println("3) Sair");
            
            int opcao = scanner.nextInt();  
            scanner.nextLine();
            if(opcao ==1){
                System.out.println("1) Cadastrar adotante");
                System.out.println("2) Adotar animal");
                System.out.println("3) Sair");
                int escolha = scanner.nextInt();
                scanner.nextLine();

                if (escolha == 1) {
                    
                    System.out.print("Nome do adotante: ");
                    String nomeAdotante = scanner.nextLine();
                    System.out.print("Endereço do adotante: ");
                    String enderecoAdotante = scanner.nextLine();
                    System.out.print("Telefone do adotante: ");
                    String telefoneAdotante = scanner.nextLine();
                    System.out.print("Email do adotante: ");
                    String emailAdotante = scanner.nextLine();
    
                    System.out.print("Idade mínima do animal: ");
                    int idadeMinima = scanner.nextInt();
                    System.out.print("Idade máxima do animal: ");
                    int idadeMaxima = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Sexo preferido do animal (masculino/feminino/indiferente): ");
                    String sexoPreferido = scanner.nextLine();
                    System.out.print("Tipo de animal preferido (Cachorro, Gato, etc.): ");
                    String tipoPreferido = scanner.nextLine();
                    System.out.print("Raça preferida do animal: ");
                    String racaPreferida = scanner.nextLine();
                    System.out.print("Prefere animal tranquilo? (true/false): ");
                    boolean prefereTranquilo = scanner.nextBoolean();
                    System.out.print("Prefere animal que gosta de passeios? (true/false): ");
                    boolean preferePasseios = scanner.nextBoolean();
                    scanner.nextLine(); 
    
                    
                    Adotante adotante = new Adotante(nomeAdotante, enderecoAdotante, telefoneAdotante, emailAdotante, idadeMinima, idadeMaxima, sexoPreferido, tipoPreferido, racaPreferida, prefereTranquilo, preferePasseios);
                    
                    adotanteService.adicionarAdotante(adotante);
                    System.out.println("Adotante cadastrado com sucesso");
                    

                
                }else if(escolha==2){
                
                System.out.println("Escolha um animal para adotar:");
                if (animais.isEmpty()) {
                     System.out.println("Nenhum animal disponível para adoção.");  
                } else {
                
                for (int i = 0; i < animais.size(); i++) {
                    System.out.println((i + 1) + ". " + animais.get(i));  
                }

                System.out.print("Escolha o número do animal: ");
                int indiceAnimal = scanner.nextInt() - 1;  
                scanner.nextLine();  

                
                if (indiceAnimal >= 0 && indiceAnimal < animais.size()) {
                
                    System.out.print("Nome do adotante: ");
                    String nomeAdotante = scanner.nextLine();
                    System.out.print("Endereço do adotante: ");
                    String enderecoAdotante = scanner.nextLine();
                    System.out.print("Telefone do adotante: ");
                    String telefoneAdotante = scanner.nextLine();
                    System.out.print("Email do adotante: ");
                    String emailAdotante = scanner.nextLine();
                        
                    
                    System.out.print("Idade mínima do animal: ");
                    int idadeMinima = scanner.nextInt();
                    System.out.print("Idade máxima do animal: ");
                    int idadeMaxima = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Sexo preferido do animal (masculino/feminino/indiferente): ");
                    String sexoPreferido = scanner.nextLine();
                    System.out.print("Tipo de animal preferido (Cachorro, Gato, etc.): ");
                    String tipoPreferido = scanner.nextLine();
                    System.out.print("Raça preferida do animal: ");
                    String racaPreferida = scanner.nextLine();
                    System.out.print("Prefere animal tranquilo? (true/false): ");
                    boolean prefereTranquilo = scanner.nextBoolean();
                    System.out.print("Prefere animal que gosta de passeios? (true/false): ");
                    boolean preferePasseios = scanner.nextBoolean();
                    scanner.nextLine();  

                    
                    Adotante adotante = new Adotante(nomeAdotante, enderecoAdotante, telefoneAdotante, emailAdotante, 
                    idadeMinima, idadeMaxima, sexoPreferido, tipoPreferido, racaPreferida, 
                    prefereTranquilo, preferePasseios);
                    adotanteService.adicionarAdotante(adotante);

                    
                    Animal animalEscolhido = animais.get(indiceAnimal);
                       if (adotante.correspondeComAnimal(animalEscolhido)) {
                             adotantes.add(adotante);  
                             Adocao adocao = new Adocao(animalEscolhido, adotante);  
                             adocoes.add(adocao);  
                             System.out.println("Adoção realizada com sucesso!");
                         } else {
                             System.out.println("O animal não é compatível com o adotante.");
                            }
                
                        }
                    }     
                }else if(escolha == 3){
                    System.out.println("Saindo...");
                    break;
                }else{
                    System.out.println("Opção inválida");
                }
        }else if(opcao == 2){
            System.out.println("1)Cadastrar animal");
            System.out.println("2) Ver animais Cadastrados");
            System.out.println("3) Cadastrar voluntário");
            System.out.println("4) Ver clientes cadastrados");
            System.out.println("5) Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            if (escolha == 1) {
                
                System.out.print("Tipo do animal (ex: Cachorro, Gato): ");
                String tipo = scanner.nextLine();  
                System.out.print("Raça do animal: ");
                String raca = scanner.nextLine();  
                System.out.print("Sexo do animal (M/F): ");
                String sexo = scanner.nextLine();  
                System.out.print("Idade do animal: ");
                int idade = scanner.nextInt();  
                scanner.nextLine();  
                System.out.print("Animal calmo? (true/false): ");
                boolean tranquilo = scanner.nextBoolean();  
                System.out.print("Animal gosta de passear? (true/false): ");
                boolean gostaPassear = scanner.nextBoolean();  
                scanner.nextLine();  
                Animal animal = new Animal(tipo, raca, sexo, idade, tranquilo, gostaPassear);
                animalService.adicionarAnimal(animal);
             
                System.out.println("Animal cadastrado com sucesso!");
            }else if(escolha == 2){
                for (Animal animal : animalService.listarTodosAnimais()) {
                        System.out.println(animal.getId() + " " + animal.getTipo() + " " + animal.getRaca() +  " - Adotado: " + (animal.isAdotado() ? "Sim":"Não"));
                    }
            }else if(escolha == 3){
                
                System.out.print("Nome do voluntário: ");
                String nomeVoluntario = scanner.nextLine();
                System.out.print("Endereço do voluntário: ");
                String enderecoVoluntario = scanner.nextLine();
                System.out.print("Telefone do voluntário: ");
                String telefoneVoluntario = scanner.nextLine();
                System.out.print("Email do voluntário: ");
                String emailVoluntario = scanner.nextLine();
                System.out.println("Área de atuação");
                String areaAtuacao = scanner.nextLine();

                
                Voluntario voluntario = new Voluntario(nomeVoluntario, enderecoVoluntario, telefoneVoluntario, emailVoluntario, areaAtuacao);
                voluntarios.add(voluntario);
                System.out.println("Voluntário cadastrado com sucesso!");

            }else if(escolha == 4){
                    for (Adotante adotante : adotanteService.listarTodosAdotantes()) {
                            System.out.println(adotante.getNome() + " " + adotante.getEmail() );
                        }
                }
            else if(escolha == 5){
                System.out.println("Encerrando...");
                break;
            }
            else{
                System.out.println("Opção inválida, tente novamente!");
            }
    }else if(opcao == 3){
        System.out.println("Encerrando...");
        break;
    }

    }
    scanner.close();
}
}
