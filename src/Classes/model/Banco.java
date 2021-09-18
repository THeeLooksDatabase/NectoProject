package Classes.model;
import java.lang.Integer;
public class Banco {
    private Integer tempo;
    private Integer tamanho;
    private Integer espaco;
    private Integer qtde;

    public Banco(Integer tempo, Integer tamanho, Integer espaco, Integer qtde){
        this.tempo = tempo;
        this.tamanho = tamanho;
        this.espaco = espaco;
        this.qtde = qtde;
    }

    public Integer getTempo(){
        return tempo;
    }
    public void setTempo(Integer tempo){
        this.tempo = tempo;
    }


    public Integer getTamanho(){
        return tamanho;
    }
    public void setTamanho(Integer tamanho){
        this.tamanho = tamanho;
    }


    public Integer getEspaco(){
        return espaco;
    }
    public void setEspaco(Integer espaco){
        this.espaco = espaco;
    }


    public Integer getQtde(){
        return qtde;
    }
    public void setQtde(Integer qtde){
        this.qtde = qtde;
    }
}
