import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { BaComponent } from './ba/ba.component';
import { BcomComponent } from './bcom/bcom.component';
import { BscComponent } from './bsc/bsc.component';
import { CompscienceComponent } from './compscience/compscience.component';
import { BbaComponent } from './bba/bba.component';
import { MaComponent } from './ma/ma.component';
import { McomComponent } from './mcom/mcom.component';
import { AboutsarvodayaComponent } from './aboutsarvodaya/aboutsarvodaya.component';
import { NoticeComponent } from './notice/notice.component';
import { HostelComponent } from './hostel/hostel.component';
import { HttpClientModule } from '@angular/common/http';
import { HeadernavComponent } from './headernav/headernav.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    BaComponent,
    BcomComponent,
    BscComponent,
    CompscienceComponent,
    BbaComponent,
    MaComponent,
    McomComponent,
    AboutsarvodayaComponent,
    NoticeComponent,
    HostelComponent,
    HeadernavComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
