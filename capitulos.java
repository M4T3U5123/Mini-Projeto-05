import java.util.Scanner;
import java.util.ArrayList;


public class capitulos {

    String name;
    String text;
    ArrayList<escolhas>esc;

    persona personagem; 
    int alteracaoenergia;
    Scanner input;

   capitulos (String name,
   String text,
   persona personagem,
   int alteracaoenergia,
   Scanner input)
{

    this.name = name;
    this.text = text;
    this.esc = new ArrayList<escolhas>();
    this.personagem = personagem; 
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;

}


void mostrarinfo(){

   System.out.println();
   System.out.println(this.name);
   System.out.println(this.text);
   this.personagem.alterarEnergia(alteracaoenergia);

   if(this.esc.size() != 0)
   {
       for(int i = 0; i < esc.size(); i ++)
       {
           System.out.println(" - " + esc.get(i).textmos);
       }
       System.out.println();
       int Idesc = selecao();
       this.esc.get(Idesc).pcap.mostrarinfo();
     
   }
   
  System.out.println();
}
int selecao()
{
    int result = -1;

    if (esc != null)
    {
    while(result == -1)
    {
        System.out.print("Faça escolha: ");
        String recebe = input.nextLine();

        for (int i = 0; i < esc.size(); i ++){
            if(recebe.equals(esc.get(i).text))
            {
                result = i;
            }
        }

    }
    System.out.println();
    }
    return result;
  }
}
