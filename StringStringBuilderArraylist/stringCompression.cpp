#include<iostream>
#include<string>

using namespace std;

string compression1(string str) {
    if(str.length()<=1) return str;
        string ans="";
        ans += str[0];
        
        for(int i=1; i<=str.length(); i++){
            int count=1;
            while(i < str.length() && str[i-1] == str[i]){
                count++;
                i++;
            }
            //if(count != 1) ans += to_string(count);
            if(i<str.length()) ans += str[i];
        }
        
    
        return ans;
    }
string compression2(string str) {
    if(str.length()<=1) return str;
        string ans="";
        ans += str[0];
        
        for(int i=1; i<=str.length(); i++){
            int count=1;
            while(i < str.length() && str[i-1] == str[i]){
                count++;
                i++;
            }
            if(count != 1) ans += to_string(count);
            if(i<str.length()) ans += str[i];
        }
        
    
        return ans;
    }
int main(int argc, char **argv) {
    
    string str;
    cin>>str;
    cout<<compression1(str)<<endl;
    cout<<compression2(str);
    return 0;
}