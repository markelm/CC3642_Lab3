/*
Autor: Markel Macedo
Disciplina: CC-3642
Descricao: Adicionar ao codigo 2 metodos a classe Time2 cujas funcoes sao: incrementar o horario em 1 segundo, em um minuto e em uma hora
*/
package markel_lab3_4;

class Time2 
{

    private int hour;
    private int minute;
    private int second;

//construtor sem argumento Time2 definido
    public Time2() 
    {
        this(0,0,0);
        //invoca o construtor time2 com tres argumentos
    }
//Construtor Time2: hora fornecida, minuto e segundo padronizados para 0;

    public Time2(int h) 
    {
        this(h,0,0);
        //invoca o construtor Time2 com tres argumentos
    }
//Construtor Time2: hora a minuto fornecidos, segundo padronizado para 0;

    public Time2(int h, int m) 
    {
        this(h,m,0);//invoca o construtor Time2 com tres argumentos
    }
//Construtor Time2: hour, minuto e second fornecidos
    public Time2(int h, int m, int s) 
    {
        setTime(h, m, s);
    }//invoca setTime para valiar a data/hora
    public Time2( Time2 time)
    {
        //invoca o construtor de tres argumentos Time2
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    
    //Metodos set
    //configurra um novo valor de data/hora usando UTC; assegura
    //que os dados permanecam consistentes configurando valores invalidos como zero
    public void setTime(int h, int m, int s)
    {
        setHour(h);//configura hour
        setMinute(m);//configura minuto
        setSecond(s);//configura segundo;
    }
    
    //valida e configura a hora
    public void setHour(int h)
    {
        hour = ((h>0 && h<24) ? h : 0);
    }
    
    //valida e configura os minutos
    public void setMinute(int m)
    {
        minute = ((m>=0 && m<60) ? m : 0);
    }
    
    //valida e configura os segundos
    public void setSecond(int s)
    {
       second = ((s>=0 && s<60) ? s :0);
    }
    
    //metodos get
    //obtem valor da hora
    public int getHour()
    {
        return hour;
    }
    
    //obtem valor do minuto
    public int getMinute()
    {
        return minute;
    }
    
    //obtem valor do segundo
    public int getSecond()
    {
        return second;
    }
    
    //converte em String no formato de data/hora universal (HH:mm:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());      
    }
    
    //converte em String no formato padrao de data/hora (H:HH:SS AM ou PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", ((getHour()==0 || getHour()==12) ? 12 : getHour()%12), getMinute(), getSecond(), (getHour()<12 ? "AM" : "PM"));
    }
    
    //incrementa hora em um segundo
    public void tick()//incrementa hora em 1 segundo
    {
        if(getSecond() + 1 > 59)//se incrementar os segundos para mais de 59, este retorna a zero e incrementa-se o minuto
        {
            setTime(getHour(), getMinute(), 0);
            incrementMinute();
        }
        else//caso contrario incrementa a hora em um segundo
        {
            setTime(getHour(), getMinute(), (getSecond() + 1));
        }
    }
    public void incrementMinute()//incrementa hora em 1 minuto
    {
        if(getMinute() + 1 > 59)
        {
            setTime(getHour(), 0, getSecond());
            incrementHour();
        }
        else
        {
            setTime(getHour(), (getMinute() + 1), getSecond());   
        }
    }
    public void incrementHour()//incrementa horario em 1 hora
    {
        setTime((getHour() + 1), getMinute(), getSecond());
    }
}//Fim da classe Time2

public class Markel_lab3_4 {

    public static void main(String[] args) {
        Time2 hora = new Time2(20, 45, 10);
        System.out.println(hora.toString());
        hora.tick();
        hora.incrementMinute();
        hora.incrementHour();
        System.out.println(hora.toString());
        Time2 hora2 = new Time2(23, 59, 0);
        System.out.println(hora2.toString());
        hora2.incrementMinute();
        System.out.println(hora2.toString());
    }

}
