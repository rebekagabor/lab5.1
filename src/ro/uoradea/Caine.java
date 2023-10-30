package ro.uoradea;

public class Caine{
    private String nume;
    private String rasa;


    public Caine(String nume, String rasa) {
        this.nume = nume;
        this.rasa=rasa;
    }

    public void setNume(String nume) {

        this.nume = nume;
    }
    public String getNume()
    {return nume;}

    public String getRasa() {
        return rasa;
    }
    }

