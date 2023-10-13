function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    let words = sentence.split(' ');

    // Reverse each word
    for (let i = 0; i < words.length; i++) {
        words[i] = words[i].split('').reverse().join('');
    }

    // Join the reversed words back into a sentence
    let reversedSentence = words.join(' ');

    return reversedSentence;
}

let sentence = "This is a sunny day";
console.log(reverseWordsInSentence(sentence));

