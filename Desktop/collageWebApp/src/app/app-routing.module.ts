import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { BaComponent } from './ba/ba.component';
import { BcomComponent } from './bcom/bcom.component';
import { BscComponent } from './bsc/bsc.component';
import { CompscienceComponent } from './compscience/compscience.component';
import { BbaComponent } from './bba/bba.component';
import { McomComponent } from './mcom/mcom.component';
import { MaComponent } from './ma/ma.component';
import { AboutsarvodayaComponent } from './aboutsarvodaya/aboutsarvodaya.component';
import { NoticeComponent } from './notice/notice.component';
import { HostelComponent } from './hostel/hostel.component';
import { HeadernavComponent } from './headernav/headernav.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'ba', component: BaComponent },
  { path: 'bcom', component: BcomComponent },
  { path: 'bsc', component: BscComponent },
  { path: 'compscience', component: CompscienceComponent },
  { path: 'bba', component: BbaComponent },
  { path: 'ma', component: MaComponent },
  { path: 'mcom', component: McomComponent },
  { path: 'sarvod', component: AboutsarvodayaComponent },
  { path: 'stunotic', component: NoticeComponent },
  { path: 'abouthostel', component: HostelComponent },
  { path: 'headernav', component: HeadernavComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
