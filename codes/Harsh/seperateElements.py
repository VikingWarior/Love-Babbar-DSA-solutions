#User function Template for python3

class Solution:
    def segregateElements(self, arr, n):
       arr1,arr2=[],[]
       for i in arr:
           if i<0:
               arr1.append(i)
           else:
               arr2.append(i)
       arr2.extend(arr1)
       arr1.clear()
       for i in range(n):
           arr[i]=arr2[i]
       arr2.clear()
        
        # print(arr)

#{ 
#  Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        ob=Solution()
        ob.segregateElements(a, n)
        print(*a)

        T -= 1


if __name__ == "__main__":
    main()





    
# } Driver Code Ends