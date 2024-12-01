let formMeasurement = document.getElementById('unit');

formMeasurement.addEventListener('submit', async (e) => {
    e.preventDefault();

    let formData = new FormData(formMeasurement);

    try {
        let path = document.querySelector('#tab-convert button.active').textContent.toLowerCase();

        let response = await fetch('http://'+ window.location.host + '/' + path, {
            method: 'POST',
            body: formData
        });

        if (response.ok) {
            document.getElementById('unit').style.display = "none";
            document.getElementById('div-result').style.display = "block"
            let data = await response.json();

            document.getElementById('result-calc').textContent = data.from + " = " +data.result + " " + data.to;
        }
    } catch (error) {
        console.error('Erro na requisição:', error);
    }
})