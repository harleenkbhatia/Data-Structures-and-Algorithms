import math
n=int(input())
def isPrime(n): 
    for j in range (2, (n+1)/2):
        if(n%j==0):
            print("prime")
            break
        else: 
            print("not prime")
            break
def checkPrime():
    t=int(input())
    for i in range(1, t+1):
        a= int(input())
        isPrime(a)
        
checkPrime()