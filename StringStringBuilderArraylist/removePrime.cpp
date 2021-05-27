#include<iostream>
#include<vector>

using namespace std;

bool isPrime(int n)
    { 
        for(int i = 2 ; i * i <= n ; i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
void removePrime(vector<int>& al){
		vector<int> ans;
		for(int ele : al){
		    if(!isPrime(ele)) ans.push_back(ele);
		}
		al.clear();
		for(int ele : ans) al.push_back(ele);
	}
int main(int argc, char **argv){
    int n; cin>>n;
    vector<int> arr(n,0);
    for(int i=0; i<n; i++) cin>>arr[i];
    removePrime(arr);
    
    string str = "[";
    for(int ele:arr) str+= to_string(ele) + ", ";
    cout<<str.substr(0,str.length()-2) + "]"; //did -2 to remove the ", " from the end of the array 
        
    return 0;
        
    }