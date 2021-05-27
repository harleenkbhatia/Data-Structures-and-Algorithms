#include <iostream>
using namespace std;

void displayArrayRev(int arr[], int idx, int n){
    
    if(idx==n) return;
    
    displayArrayRev(arr,idx+1,n);
    
    cout<<arr[idx]<<endl;
}

int main(){
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    displayArrayRev(arr, 0, n);
}