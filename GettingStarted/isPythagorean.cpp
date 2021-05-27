#include <iostream>
using namespace std;

bool isPythagorean(int a,int b,int c){
    if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (c*c + b*b == a*a)) return true;
    
    return false;
}
int main(int argc, char **argv){
    int a,b,c;
    cin >> a >> b >> c;
    
    cout<<(boolalpha)<<isPythagorean(a,b,c)<<endl;
    
}
