package com.example.misitiomusical;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void ingresarMenuPrincipal(View view){
    	Intent intent;
    	EditText editTextUsuario=(EditText)findViewById(R.id.editTextUsuario);
    	EditText editTextClave=(EditText)findViewById(R.id.editTextClave);
    	String usuario =(String)editTextUsuario.getText().toString();
    	String clave =(String)editTextClave.getText().toString();
    	
    	if(usuario.equals("manager")&&clave.equals("manager")){
    		intent=new Intent(this,MenuManagerActivity.class);
    		startActivity(intent);
    	}
    	
    }
    public void lanzar(View view) {
        Intent i = new Intent(this, reg1.class );
        startActivity(i);
  }    
    
}
