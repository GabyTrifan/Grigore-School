#include<iostream>
#include<cstring>
using namespace std;
void ex1()
{
	struct colet {int Euro,Kg;
	char oras[31];};colet x;
	cout<<"Valoarea coletului (Euro): ";cin>>x.Euro;
	cout<<"Greutatea coletului (Kg): ";cin>>x.Kg;cin.get();
	cout<<"Destinatia coletului: ";cin.get(x.oras,31);


}