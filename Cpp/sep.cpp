#include<iostream>
#include<cstring>
#include "file-1.cpp"
using namespace std;
void ex2()
{
	char S[41];
	int i,j,n;
	cin.get(S,40);n=strlen(S);
	for (i=0;i<n;i++)
		for(j=0;j<n;j++)
			if (i==j) cout<<S[j];
	cout<<endl;
	system("pause");
}
