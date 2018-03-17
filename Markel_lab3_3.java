/*
Autor: Markel Macedo
Disciplina: CC-3642
Descricao: Criar uma classe Rectangle que possui os atributos length e width, metodos set, get, calcular a area e calcular o perimetro
*/
package markel_lab3_3;
class Rectangle
    {
        private float width;//atributo width
        private float length;//atributo length
        
        public Rectangle()//construtor que inicializa o objeto com atributos de valor 1
        {
            this.length = 1;
            this.width = 1;
        }
        public void setLength(float l)//determinar o valor do atributo length
        {
            length = ((l>0 && l<20) ? l : 1);
        }
        public void setWidth(float w)//determinar o valor do atributo width
        {
            width = ((w>1 && w<20) ? w : 1);
        }
        public float getWidth()//obtem o valor do atributo width
        {
            return width;
        }
        public float getLength()//obtem o valor do atributo length
        {
            return length;
        }
        public String area()//calcula a area do retangulo
        {
            return String.format("Area: %f", (getWidth()*getLength()));
        }
        public String perimetro()//calcula o perimetro do retangulo
        {
            return String.format("Perimetro: %f", ((getWidth()+getLength())*2));
        }
    }

public class Markel_lab3_3 {

    

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();//inicializa o objeto r1 da classe Rectangle
        r1.setLength(10);//atribui o valor 10 ao atributo length de r1
        r1.setWidth(8);//atribui o valor 8 au atributo width de r1
        System.out.println(r1.area());//imprime a area
        System.out.println(r1.perimetro());//imprime o perimetro
        
    }
    
}
