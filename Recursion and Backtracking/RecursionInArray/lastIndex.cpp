#include <iostream>
using namespace std;

int lastIndex(int arr[], int idx, int x){
    if(idx==-1) return -1;
    if(arr[idx]==x) return idx;
        
    return lastIndex(arr, idx-1, x);

}

int main(){
    int n;
    cin >> n;
    int d;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cin >> d;
    int p = lastIndex(arr, n-1, d);
    cout << p << endl;
}