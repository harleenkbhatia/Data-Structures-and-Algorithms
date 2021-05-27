#include<vector>
#include<iostream>

using namespace std;

bool isPalindrome(vector<int>& arr, int vsi, int vei){ //virtual starting/ending index
        if(vsi>=vei) return true;
        if(arr[vsi]!=arr[vei]) return false;
        
        return isPalindrome(arr, vsi+1,vei-1);
    }
int main() {
        int n; cin>>n;
        vector<int>arr(n,0);
        for(int i=0; i<n;i++) cin>>arr[i];
        cout<<(boolalpha)<<isPalindrome(arr,0,n-1)<<endl;
    }