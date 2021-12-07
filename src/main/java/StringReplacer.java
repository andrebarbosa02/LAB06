public class StringReplacer implements StringTransformer{
    char x, y;
    public StringReplacer(char a, char b) {
        x=a;
        y=b;
    }

    @Override
    public void execute(StringDrink drink) {
        String replaced = drink.getText().replace(x,y);
        drink.setText(replaced);
    }
}
