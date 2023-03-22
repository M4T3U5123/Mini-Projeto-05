public class persona {
    String nomepers;
    int energiapers;

    persona(String nome, int energia)
    {
               this.nomepers = nome;
               this.energiapers = 100;
    }

    void alterarEnergia(int alteracao){
       this.energiapers = this.energiapers +alteracao;

       if(alteracao > 0)
       {
           System.out.println("Este movimento,  Alterou no Personagem "+ this.nomepers + " restaurando "+ alteracao +" Pontos de Energia. ");
       }
       else {
           System.out.println("Este movimento,  Alterou no Personagem "+ this.nomepers + " consumindo "+ alteracao +" Pontos de Energia. ");
       }

       if(this.energiapers > 100)
       {
           this.energiapers = 100;
       }
       else if (this.energiapers < 0)
       {
           this.energiapers = 0;
           System.out.println(this.nomepers +" foi derrotado.");
       }
    }
}
