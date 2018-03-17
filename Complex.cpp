#include <iostream>
#include <cmath>
#include "Complex"

using namespace std;

int main()
{
	Complex n1(10, 5);
	Complex n2(5, 20);

	Soma soma1(n1,n2);
	soma1.result();
	Subtracao sub1(n1,n2);
	sub1.result();

	return 0;

}