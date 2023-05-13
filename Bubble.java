public class Bubble {
    public static void main(String[] args) {
        int [] vet = {40,23,51,76,2};

        System.out.println("Desordenado: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println();

        System.out.println("\nOrdenado: ");
        exibirVetor(bubbleSort(vet));
    }

    public static int[] bubbleSort(int[] vet){
        int aux = 0;
        for(int i = 0; i < vet.length; i++){
            for(int j = 0; j < (vet.length -1 ); j++){
                if(vet[j]> vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        return vet;
    }

    public static void exibirVetor(int []vet){
        for(int i = 0; i< vet.length; i++){
            System.out.print(vet[i] + " " );
        }
    }
}

