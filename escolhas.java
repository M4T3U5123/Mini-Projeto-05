public class escolhas {
    String text;// O texto que é digitado 
    String textmos; // O texto que é mostrado na tela
    capitulos pcap;//A reférencia ao objeto capitulo recebendo escolhas como o conceito  hierarquico

    escolhas(String text, capitulos pcap, String textmos)
    {
        
        this.text = text;
        this.textmos = textmos;
        this.pcap = pcap;
    }
}
