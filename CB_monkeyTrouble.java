boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday) {
        return true;   
    } else if (vacation) {
        return true;   
    } else {
        return false; 
    }
}