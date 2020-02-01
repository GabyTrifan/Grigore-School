#include<iostream>
#include<cstring>
using namespace std;
void fractii()
{
	struct fractie {
	int x,y;
	}; fractie F,G,H;
	H.x=F.x*G.y+F.y*G.x;
	H.y=F.y+G.y;


}
int main()
{
	char s1[21],v[]="aeiou";int i,j;
	cout<<"Sir: ";cin.get(s1,20);cin.get();
	for (i=0;i<4;i++)
	{
		if(strchr(s1,v[i]))
			for (j=0;j<strlen(s1);j++)
				if (s1[j]!=v[i])
					cout<<s1[j];
			cout<<"\n";
	} 
	system("pause");
	
}