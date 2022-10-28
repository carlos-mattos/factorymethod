public class Pedigree implements IRacao{

    public String vender(float quantidade) {
        return "Foi vendido " + quantidade + " sacos de racao da Pedigree";
    }

    public String repor(float quantidade) {
        return "Foi reposto " + quantidade + " sacos de racao da Pedigree";
    }
}
