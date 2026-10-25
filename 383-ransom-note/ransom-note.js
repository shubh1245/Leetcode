
var canConstruct = function(ransomNote, magazine) {
    let freq = new Array(26).fill(0);

    for (let i = 0; i < magazine.length; i++) {
        let index = magazine.charCodeAt(i) - 97;
        freq[index]++;
    }

    for (let i = 0; i < ransomNote.length; i++) {
        let index = ransomNote.charCodeAt(i) - 97;

        if (freq[index] === 0) {
            return false;
        }

        freq[index]--;
    }

    return true;
};
