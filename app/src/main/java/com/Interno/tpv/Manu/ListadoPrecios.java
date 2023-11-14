package com.Interno.tpv.Manu;

import static com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper.COLUMN_NOMBRE;
import static com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper.COLUMN_PRECIO;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper;
import com.Interno.tpv.R;

public class ListadoPrecios extends AppCompatActivity {

        private EditText editTextProductId, editTextNewPrice, teditTextProducName;
        private Button buttonUpdatePrice, buttonAddProduct, buttonSearchProduct,buttonexit;
        private DDBBPreciosHelper databaseHelper;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_listado_precios);

            editTextProductId = findViewById(R.id.IdLPN);
            editTextNewPrice = findViewById(R.id.PrecioLPN);
            teditTextProducName = findViewById(R.id.NombreLPN);
            buttonUpdatePrice = findViewById(R.id.aplybtn);
            buttonAddProduct = findViewById(R.id.addbtn);
            buttonSearchProduct = findViewById(R.id.buscarbtn);
            buttonexit = findViewById(R.id.volvbt);

            databaseHelper = new DDBBPreciosHelper(this);

            buttonUpdatePrice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int productId = Integer.parseInt(editTextProductId.getText().toString());
                    String newName = teditTextProducName.getText().toString();
                    double newPrice = Double.parseDouble(editTextNewPrice.getText().toString());

                    boolean isUpdated = databaseHelper.updateProductPrice(productId,newName, newPrice);

                    if (isUpdated) {
                        Toast.makeText(ListadoPrecios.this, "Precio actualizado con éxito", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(ListadoPrecios.this, "Error al actualizar el precio", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            buttonAddProduct.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String productName = teditTextProducName.getText().toString();
                    double productPrice = Double.parseDouble(editTextNewPrice.getText().toString());

                    boolean isAdded = databaseHelper.addProduct(productName, productPrice);

                    if (isAdded) {
                        int newRowId = databaseHelper.getLastInsertedId();
                        Toast.makeText(ListadoPrecios.this, "Producto añadido con éxito con id: " + newRowId , Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(ListadoPrecios.this, "Error al añadir el producto", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            //Al pulsar el boton buscar, se busca el producto en la base de datos mediantre su id y se muestra su nombre y precio
            buttonSearchProduct.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int productId = 0;
                    try {
                        productId = Integer.parseInt(editTextProductId.getText().toString());
                        Cursor cursor = databaseHelper.getProductById(productId);
                        if(cursor.moveToFirst()) {
                            String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                            double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                            teditTextProducName.setText(String.valueOf(itemName));
                            editTextNewPrice.setText(String.valueOf(itemPrice));
                        }else {
                            Toast.makeText(ListadoPrecios.this, "Producto no encontrado", Toast.LENGTH_SHORT).show();
                        }
                    } catch (NumberFormatException e) {
                        Toast.makeText(ListadoPrecios.this, "Introduce un id válido", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            buttonexit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    databaseHelper.closeDatabase();
                    Intent intent = new Intent(ListadoPrecios.this, MenuPrivado.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }