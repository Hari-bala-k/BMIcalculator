function result(){
    let weight=prompt("Enter your weight (kg) :");
    let hight=prompt("Enter your hight (cm)   :");

    let w=parseFloat(weight);
    let hig=parseFloat(hight);

    let h=hig/100;

    let bmi=w/(h**2)
    if(bmi>=18 && bmi<=24)
    {document.getElementById("show").innerHTML=`Your BMI Value is :${bmi.toFixed(2)}<br>
     you are Healthy`;}
    else{
    document.getElementById("show").innerHTML=`Your BMI Value is :${bmi.toFixed(2)}<br>
     you are Not Healthy`;
    }
}