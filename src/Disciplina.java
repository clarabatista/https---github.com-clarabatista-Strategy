public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private String situacao;
    private ICalcMedia calculaMedia;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getP1() {
        return p1;
    }
    public void setP1(double p1) {
        this.p1 = p1;
    }
    public double getP2() {
        return p2;
    }
    public void setP2(double p2) {
        this.p2 = p2;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public ICalcMedia getCalcMedia() {
        return calculaMedia;
    }
    public void setCalcMedia(ICalcMedia calculaMedia) {
        this.calculaMedia = calculaMedia;
    }

    public Disciplina(){
        nome = "Ana Clara";
        p1 = 0.0;
        p2 = 0.0;
    }

    public void calcularMedia() {
        double media = calculaMedia.calculaMedia(p1, p2);
        situacao = calculaMedia.situacao(media);
    }
}