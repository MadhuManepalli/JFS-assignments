function isEven()
        {
            arr=[1,3,5,4,2];
            for(let i in arr)
            {
               let num=arr[i];
               document.write(" "+arr[i])
                if(num%2==0)
                {
                    document.write(true);
                    return(num);
                
                }
                else{
                    document.write(false);
                    
                }
            }
        }
        function find(arr)
        {
            return isEven();
        }
        document.write("/"+isEven());