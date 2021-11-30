package com.bridgelabz;

/**
 * This class is for data validation
 */
public class DataValidation {
    /**
     * to check the name
     * @param name
     * @return
     */
    public boolean nameValidation(String name){
        String regex ="^[A-Z][a-z]{2,}$";
        return (name.matches(regex));
    }

    /**
     * to check the address
     * @param address
     * @return
     */
    public boolean addressValidation(String address) {
        String regex = "^[A-Z][a-z]{2,}$";
        return (address.matches(regex));
    }

    /**
     * to check city format
     * @param city
     * @return
     */
    public boolean cityValidation(String city) {
        String regex = "^[A-Z][a-z]{2,}$";
        return (city.matches(regex));
    }

    /**
     * to check phonenumber format
     * @param phoneNumber
     * @return
     */
    public boolean numberValidation(String phoneNumber) {
        String regex = "^[6-9][0-9]{9}";
        return (phoneNumber.matches(regex));
    }

    /**
     * to check state format
     * @param state
     * @return
     */
    public boolean stateValidation(String state) {
        String regex = "^[A-Z][a-z]{2,}$";
        return (state.matches(regex));
    }

    /**
     * to check email format
     * @param email
     * @return
     */
    public boolean emailValidation(String email) {
        String regex = "^[a-zA-Z0-9.-]{1,}@[a-zA-Z]{1,}.[a-z]{1,}$";
        return (email.matches(regex));
    }

    /**
     * to check zipcode format
     * @param zipCode
     * @return
     */
    public boolean zipCodeValidation(String zipCode) {
        String regex = "^[1-9][0-9]{5}";
        return (zipCode.matches(regex));
    }
}
