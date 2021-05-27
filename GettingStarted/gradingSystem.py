n= int(input())

def gradingSystem(n):
    if n > 90:
        print("excellent")
        
    elif n > 80 and n <= 90:
        print("good")
        
    elif n > 70 and n <= 80:
        print("fair")
        
    elif n > 60 and n <= 70:
        print("meets expectations")
        
    else:
        print("below par")
gradingSystem(n)
