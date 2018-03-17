#include <iostream>
#include <cmath>
#include <string>
#include "Complex.h"

using namespace std;

class Complex
{
	public:
		Complex(double real = 1, double img = 0) : real(a), img(b) {}
		double getReal()
		{
			return real;
		}
		double getImg()
		{
			return img;
		}
	private:
		double real;
		double img;
};
class Soma
{
	Soma(Complex &cn1, Complex &cn2){}
	public:
		double getSomaReal()
		{
			return (cn1.real + cn2.real);
		}
		double getSomaImg()
		{
			return (cn1.img + cn2.img);
		}
		void result()
		{
			cout << "(" << getSomaReal() << "," << getSomaImg() << endl; 
		}
	private:
		Complex cn1;
		Complex cn2;
};
class Subtracao
{
	Subtracao(Complex &cn1, Complex &cn2){}
	public:
		double getDifReal()
		{
			return (cn1.real - cn2.real);
		}
		double getDifImg()
		{
			return (cn1.img - cn2.img);
		}
		void result()
		{
			cout << "(" << getDifReal() << "," << getDifImg() << endl; 
		}
	private:
		Complex cn1;
		Complex cn2;
};