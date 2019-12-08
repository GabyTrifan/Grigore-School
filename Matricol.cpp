#include<iostream>
#include<cstring>
using namespace std;
int main()
{
    struct Matricol
    {
        int matricol;
        float med1,med2;
    };
    Matricol x;
    cout<<"Media pe sem. I: ";cin>>x.med1;
    cout<<"Media pe sem. II: ";cin>>x.med2;
    int media=(x.med1+x.med2)/2;
    cout<<"media: "<<media;
}