import {NgModule} from '@angular/core';
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatDialogModule} from '@angular/material/dialog';
import {MatTabsModule} from '@angular/material/tabs';

const MD_COMPONENT_MODULES = [
  MatButtonModule,
  MatInputModule,
  MatFormFieldModule,
  MatDialogModule,
  MatTabsModule,
];

@NgModule({
  imports: MD_COMPONENT_MODULES,
  exports: MD_COMPONENT_MODULES
})
export class AppAngularMaterialModule {
}
