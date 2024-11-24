var lastCheck = null
function radioOn(radio, n){

    if(radio == lastCheck){ //deligar o radio
        radio.checked = false;
        lastCheck = null
    }
    else{
        if (lastCheck !== null) {
            lastCheck.checked = false; // Desmarcar o rádio anterior
            
        }
        lastCheck = radio; // Liga radio
    }
    OcultConteiner(n)
}

function OcultConteiner(num){
    String.toString(num)
    const ocult = document.getElementById(`ocult${num}`)
    if(lastCheck != null){
        ocult.style.display = "flex";
    }
    else{
        ocult.style.display = "none"
    }
}

function compartinhar() {
            const button = document.querySelector('#share')

            button.addEventListener("click", () => {
                const InputPix = document.querySelector('#pix')
                const Pix = InputPix.getAttribute('value');

                navigator.clipboard.writeText(Pix)
                    .then(() => {
                        NotifySuccess("Link copiada com Sucesso 👍") //NÃO FUNCIONA :(
                    })
                    .catch(err => {
                        console.error('Erro ao copiar o link: ', err);
                    });
            })
        }