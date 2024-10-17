// Funcionlaidad del menu hamburguesa
const menuBtn = document.querySelector(".menu_btn");
const navigation = document.querySelector(".navegacion");

menuBtn.addEventListener('click', () =>{
    menuBtn.classList.toggle('active');
    navigation.classList.toggle('active');
});




