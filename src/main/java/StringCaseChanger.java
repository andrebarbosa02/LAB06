public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String mutated = new String(drink.getText());
        StringBuilder appended = new StringBuilder();
        for (int i=0; i<mutated.length();i++){
            if (Character.isLowerCase(mutated.charAt(i))){
                appended.append(Character.toUpperCase(mutated.charAt(i)));
            }else{
                appended.append(Character.toLowerCase(mutated.charAt(i)));
            }
        }
        drink.setText(appended.toString());
    }
}
