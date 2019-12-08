#include<iostream>
#include<cmath>
using namespace std;
void ex3()
{
	struct punct {int x,y;}; punct a,b;
	cout<<"Coordonatele punctului a -> x ";cin>>a.x;
	cout<<"							-> y ";cin>>a.y;
	cout<<"Coordonatele punctului b -> x ";cin>>b.x;
	cout<<"                         -> y ";cin>>b.y;
	cout<< sqrt(pow(a.x-b.x,2)+pow(a.y-b.y,2));
	system("pause");
}
int main()
{
	ex3();
}