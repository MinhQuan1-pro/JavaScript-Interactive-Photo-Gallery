function upDate(previewPic) {
    console.log("Event triggered!");
    console.log("ALT:", previewPic.alt);
    console.log("SRC:", previewPic.src);

    const imgDiv = document.getElementById("image");

    // đổi text
    imgDiv.textContent = previewPic.alt;

    // đổi background-image
    imgDiv.style.backgroundImage = `url('${previewPic.src}')`;
}

function undo() {
    const imgDiv = document.getElementById("image");

    // reset
    imgDiv.style.backgroundImage = "url('')";
    imgDiv.textContent = "Hover over an image below to display here.";
}
