/**
 * 
 */
 function calculatePower(num,pow){
    let result = 1;
    for(let i=0;i<pow;i++){
        result = calculateProduct(result,num);
    }
    return result;
}
 