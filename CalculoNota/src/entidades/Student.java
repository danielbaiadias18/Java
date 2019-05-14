package entidades;

public class Student {
    public String name;
    public float notas[] = new float[10];
    
    public float SomaNotas()
    {
        return notas[0] + notas[1] + notas[2];
    }
    
    public String FinalResult(float soma)
    {
        if(soma>=60)
        {
            return "PASS";
        }
        else if(soma<60)
        {   
            return "FAILED" + "\n" + "MISSING " + String.valueOf(60-soma) + " POINTS";   
        }
        else
        {
            return "Error 404";
        }
    }

}
