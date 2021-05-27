n= int(input())
def oddEven(n):
    if n%2==0:
        print("{} is Even".format(n))
    else:
        print("{} is Odd".format(n)) 
def checkOddEven():
    t=int(input())
    for i in range(1,t+1):
        a= int(input())
        oddEven(a)
checkOddEven()