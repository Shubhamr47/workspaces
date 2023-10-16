const a = [4,1,6,-2,-5,8,3,-9,5];

const firstNeg = (num)=>{
    return num<0;
};

const result = a.find(firstNeg);

console.log(result);

a.forEach((num)=>{
    console.log("array num",num)
})