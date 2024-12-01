let input = document.getElementById('input-number');

input.addEventListener('input', (e) => {
    let value = e.target.value;

    // Remove caracteres não numéricos, exceto ponto ou vírgula
    value = value.replace(/[^0-9.]/g, '');

    // Substitui múltiplos pontos ou vírgulas por um único
    value = value.replace(/(\.)(?=.*\1)/g, '');

    // Garante que haja apenas um separador decimal (ponto ou vírgula)
    const parts = value.split(/[.]/);
    if (parts.length > 2) {
        value = `${parts[0]}.${parts[1]}`;
    }

    e.target.value = value;
});