#include<iostream>
#include<vector>

using namespace std;

void reverse(vector<int>& arr,int i,int j) {
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
            
        i++;
        j--;
    }
}
void rotate(vector<int>& arr, int k) {
    int n= arr.size();
    k = (k % n + n ) % n;
    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,k, n-1);
    }
    
int main(int argc, char **argv){
    
    int n, k; cin>>n;
    vector < int > arr(n);
    for(int i; i<n; i++) cin>>arr[i];
    cin>>k;
    rotate(arr,k);
    for(int ele : arr) cout<<ele<<" ";
    
    return 0;
}
