import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { BreadcrumbComponent } from '../componentes/breadcrumb/breadcrumb.component';



@NgModule({
  declarations: [
    BreadcrumbComponent,
  ],
  imports: [
    CommonModule,
  ],
  exports: [
    BreadcrumbComponent,
  ]
})
export class SharedModule { }
