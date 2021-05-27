#include <iostream>
using namespace std;
    
int LCM(int num1, int num2, int gcd)
{
    return ((num1/gcd)*num2);
}

int GCD(int num1, int num2)
{
    int divisor= num1;
    int dividend= num2;
    while(dividend%divisor!=0){
        int rem=dividend%divisor;
        dividend=divisor;
        divisor=rem;
    }
    return divisor;
}
int main(int argc, char **argv){
    int num1, num2;
    cin>>num1>>num2;
    int gcd=GCD(num1,num2);
    cout<<GCD(num1,num2)<<endl;
    cout<<LCM(num1,num2,gcd);
    return 0;
}
    