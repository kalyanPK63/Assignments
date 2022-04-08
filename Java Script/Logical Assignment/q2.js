var myArray = new Array();
function max(myArray) {
    for(i = 0; i < myArray.length; i++){
        var maxn = myArray[0]; 
        if (maxn < myArray[i]){
            maxn = myArray[i];
        }
        else{
            maxn = maxn;
        }
    }
    document.write(maxn);
}
max([7,5,3,10]);